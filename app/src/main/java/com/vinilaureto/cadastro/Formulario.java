package com.vinilaureto.cadastro;

public class Formulario {
    private String name;
    private String phone;
    private String email;
    private boolean emailList;
    private SexoValue sex;
    private String city;
    private String state;

    public Formulario(String name, String phone, String email, boolean emailList, SexoValue sex, String city, String state) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.emailList = emailList;
        this.sex = sex;
        this.city = city;
        this.state = state;
    }

    @Override
    public String toString() {
        return  "Nome: " + name + "\n" +
                "Telefone: " + phone + "\n" +
                "E-mail: " + email + "\n" +
                "Lista de e-mail: " + (emailList ? "Aceitou" : "Negou") + "\n" +
                "Sexo: " + sex + "\n" +
                "Cidade: " + city + "\n" +
                "Estado: " + state;
    }
}
