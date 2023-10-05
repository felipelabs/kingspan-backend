package com.kingspanapi.kingspanbackend.exception;

public class UseNotFoundException extends RuntimeException{

    public UseNotFoundException(Long id){
        super("O usuário não foi encontrado com o id: " + id);
    }
}
