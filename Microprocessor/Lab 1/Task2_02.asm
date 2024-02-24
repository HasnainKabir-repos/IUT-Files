org 0100h
.Code  
Main Proc
    Mov AX,0Bh

    Mov BX,200
    Sub BX,225

    MUL BX

    
    Add AX,127
    Main ENDP
END Main
Ret