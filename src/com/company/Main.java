package com.company;

public class Main {
    static char t;
    public static void main(String[] args) {
        Huffman huffman=new Huffman("Bogorodskii Artem Pavlovich");
        System.out.println(huffman.getCodeText());
        huffman.getSizeBits();//размер в битах
        System.out.println((double) huffman.getSizeBits()/(huffman.getValueOfCharactersOfText()*8)); //коэффициент сжатия относительно aski кодов
        System.out.println((double) huffman.getSizeBits()/(huffman.getValueOfCharactersOfText()*
                (Math.pow(huffman.getValueOfCharactersOfText(),0.5)))); //коэффициент сжатия относительно равномерного кода.
        System.out.println(huffman.getMediumLenght());//средняя длина кодового слова
        System.out.println(huffman.getDisper());//дисперсия
    }
}