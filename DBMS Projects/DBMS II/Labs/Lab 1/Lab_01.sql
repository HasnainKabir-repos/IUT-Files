--Task 1 

Create table franchise(
    ID int primary key,
    Name varchar2(250),
    Address varchar2(250),
    city varchar2(250)
);

Create type preferred_cuisines as varray(5) of varchar2(20);
/

Create table customer(
    ID int primary key,
    Name varchar2(250),
    phone varchar2(12),
    cuisines preferred_cuisines
);

Create table registers(
    customerId int ,
    franchiseId int,
    foreign key (customerId) references customer(customerId),
    foreign key (franchiseId) references franchise(franchiseId)
);

Create table branch(
    Id int primary key,
    branchName varchar2(250),
    franchiseId varchar2(250),
    foreign key(franchiseId) references franchise(franchiseId)
);

Create table chef(
    Id int primary key,
    name varchar2(250),
    branchId int,
    foreign key(branchId) references branch(branchId)
);

Create table develops(
    chefId int,
    cuisineName varchar2(250),
    menuId int,

    foreign key (chefId) references chef(Id),
    foreign key (menuId) references menu(Id)
);

Create table menu(
    Id int primary key,
    name varchar2(250),
    ingredients varchar2(250),
    price int,
    calorie_count int
);

Create table order(
    Id int primary key,
    customerId int,
    menuId int,
    rating int,

    foreign key(customerId) references customer(customerId),
    foreign key(menuId) references menu(menuId)
);

--Task 2

--a

select count(customer.Id), a.franchise.name from customer join 
(select * from registers join franchise on franchise.Id = registers.franchiseId) as a
on customer.Id = a.customerId group by franchise.name; 

--b

select avg(rating), franchise.name from order, menu, develops, chef, branch, franchise 
where order.menuId = menu.Id and menu.Id = develops.menuId
and develops.chefId = chef.Id and chef.branchId = branch.Id 
and branch.franchiseId = franchise.Id group by franchise.name;

--c
select count(order.Id) as orders, menu.name
from order, menu where menu.Id = order.menuId
group by menu.name order by orders desc having rownum<=5;

--d
select customer.name
from customer join registers on customer.Id = registers.customerId
join franchise on registers.franchiseId = franchise.Id
join develops on franchise.Id = develops.franchiseId
join menu on develops.menuId = menu.Id
join order on order.menuId = menu.Id
group by customer.name
having count(distinct franchise.Id) >= 2;

--e
select name from customer
where customer.Id not in (select customerId from `order`);