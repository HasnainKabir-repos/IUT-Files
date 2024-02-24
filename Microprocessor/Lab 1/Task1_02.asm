org 0100h
.Code  
Main Proc
    Mov AX,15
    Add AX,30

    Mov BX,575
    Sub BX,225

    MUL BX

    ADD AX,210  
    Main ENDP
End Main
RET