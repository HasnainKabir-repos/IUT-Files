org 0100h
.Code  
Main Proc
    MOV AX, 0FFFh

    MOV BX, 10h
    MUL BX

    ADD AX, 1111b
    Main ENDP
END MAIN
RET