
; You may customize this and other start-up templates; 
; The location of this template is c:\emu8086\inc\0_com_template.txt




ORG 0100h
MAIN PROC
; display prompt
MOV AH, 2
MOV DL, '?'
INT 21h
; input a character
MOV AH, 1
INT 21h
MOV BL, AL
; go to a new line with carriage return
MOV AH, 2
MOV DL, 0DH
INT 21h
MOV DL, 0AH
INT 21h  


CMP BL, 'A'
JB invalid
CMP BL, 'Z'
JA check_lower_case
ADD BL, 32
JMP display    


check_lower_case:
CMP BL, 'a'
JB invalid
CMP BL, 'z'
JG invalid
SUB BL, 32
JMP display


invalid: 
;will not print anything  
JMP exit_program

; display character 
display:
MOV DL, BL
INT 21h  

exit_program:
; return to DOS
MOV AH, 4CH
INT 21H
MAIN ENDP
END MAIN
RET