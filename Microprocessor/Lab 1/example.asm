
; You may customize this and other start-up templates; 
; The location of this template is c:\emu8086\inc\0_com_template.txt

org 100h

.DATA
A DB 11
B DW 500

SUM DW ?
DIFFERENCE DW ? 
MULTIPLICATION DW ?
DIVISION DB ?

.CODE
MAIN PROC
    MOV AL, 30
    ADD AL, 15    
    
    MAIN ENDP
END MAIN
RET

ret




