package com.example.blog_pessoal.model;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_postagens")
public class Postagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String texto;

    @Column(nullable = false)
    private LocalDate data = LocalDate.now();

    // Getters
    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getTexto() {
        return texto;
    }

    public LocalDate getData() {
        return data;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
