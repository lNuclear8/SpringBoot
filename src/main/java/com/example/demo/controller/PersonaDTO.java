package com.example.demo.controller;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PersonaDTO {
    private String nombre;
    private int edad;
}
