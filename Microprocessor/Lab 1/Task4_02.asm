org 0100h
.Code  
Main Proc
    Mov AX,260

    Mov BX,10

    MUL BX

    Mov BX,5

    Div BX

    Add AX,32

    Sub AX,1
    Main ENDp
END MAIN
RET