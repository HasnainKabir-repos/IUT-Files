
; You may customize this and other start-up templates; 
; The location of this template is c:\emu8086\inc\0_com_template.txt

org 100h   

.DATA

A db 5 DUP('$') 
B db 0dh, 0ah, '$'

.CODE

MAIN PROC   

    
    MOV AX, @DATA
    MOV DS, AX
    MOV SI, OFFSET A
    
    MOV CX, 5
    
LOOP1:
    MOV AH, 01h
    INT 21h
    CMP AL, 13  ; FOR ENTER KEY
    JE DONE
    
    SUB AL, 'A'
    MOV [SI], AL
    INC SI
    LOOP LOOP1

DONE:
    MOV CX, 5  
    MOV SI, OFFSET A   
    ADD SI, 4
    
    MOV AH, 9
    LEA DX, B
    INT 21h

PRINT:
    MOV DL, [SI]
    ADD DL, 'A'
    SUB DL, 32
    MOV AH, 02h
    INT 21h
    DEC SI
    LOOP PRINT
    
    MOV AH, 4Ch
    INT 21h
    
   
MAIN ENDP
END MAIN

ret




