library ieee;
use ieee.std_logic_1164.all;

entity circuit1 is
	port (
		a, b, c: in std_logic;
		sig1: inout std_logic;
		out1   : out std_logic
	);
end circuit1;

architecture data_circuit1 of circuit1 is
begin
	sig1 <= a and b;
		
	out1 <= sig1 or c;
end data_circuit1;