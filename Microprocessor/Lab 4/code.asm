ORG 100h

.DATA
    ARRAY DB 1,2,3,4,5,6,7,8,9
    TEXT DB 'The value of N in between 2 ~ 9',0Dh, 0Ah, '$'
    NEW DB 0Dh, 0Ah, '$'
    SUM DB 00h 
.CODE

MAIN PROC
    MOV AH, 9
    LEA DX, TEXT
    INT 21h
    
    MOV AH, 1
    INT 21h
     
    MOV DL,AL
    SUB DL,'0'
    
    XOR AX,AX
    MOV SI,0
    MOV BL,0
    
    SUM_LOOP:
        MOV AL,ARRAY[SI]
        CMP AL,DL
        JG ENDLOOP        
        MUL AL 
        ADD BX,AX
        INC SI 
        LOOP SUM_LOOP
    ENDLOOP:
        RET  
        
          
    
    MAIN ENDP
END MAIN

RET