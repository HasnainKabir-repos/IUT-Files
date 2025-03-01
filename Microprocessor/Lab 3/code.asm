
; You may customize this and other start-up templates; 
; The location of this template is c:\emu8086\inc\0_com_template.txt

org 100h

.DATA 
    input_string DB 'We are IUT Students', 0Dh, 0Ah, '$'   
    string_length DW 0
    
.CODE

main PROC
    
   mov ax, @DATA
   mov ds, ax   
   xor cx, cx ; reset the CX register 
    
   ; DISPLAY STRING
   mov ah, 09h  
   lea dx, input_string
   int 21h    
               
   ; Calculate the number of characters in the string
    mov cx, 0                     ; Initialize CX register to count characters
    mov si, offset input_string   ; Initialize SI register to point to the start of the string  
    
    
count_loop:
    mov dl, [si]            ; Load the character at SI into DL
    cmp dl, '$' 
    je end_counting         ; If end of string, exit loop
    inc cx                  ; Increment character count
    inc si                  ; Move to the next character
    jmp count_loop                                         
    
end_counting:   
            
    ; Display the character count
    mov ah, 02h             ; Function to display character 
    mov dx, 0
    mov dx, cx
    int 21h

main ENDP
END main
ret 





