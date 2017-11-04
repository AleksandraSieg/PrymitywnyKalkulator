package pl.madison.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(value = "/dodawanie/{liczba1}/{liczba2}")
    public String dodawanie(@PathVariable("liczba1") int liczba1, @PathVariable("liczba2") int liczba2){
        int wynik = liczba1 + liczba2;
        return "wynik dodawania to "+wynik;
    }

    @RequestMapping(value = "/odejmowanie/{liczba1}/{liczba2}")
    public String odejmowanie(@PathVariable("liczba1") int liczba1, @PathVariable("liczba2") int liczba2){
        int wynik = liczba1 - liczba2;
        return "wynik odejmowania to "+wynik;
    }

    @RequestMapping(value = "/mnozenie/{liczba1}/{liczba2}")
    public int mnozenie(@PathVariable("liczba1") int liczba1, @PathVariable("liczba2") int liczba2){
        int wynik = liczba1*liczba2;
        return wynik;
    }

    @RequestMapping(value = "/dzielenie/{liczba1}/{liczba2}")
    public String dzielenie(@PathVariable("liczba1") int liczba1, @PathVariable("liczba2") int liczba2){
        String wynik = "";
        if(liczba2!=0){
            return "Wynik dzielenia to "+liczba1/liczba2;
        }else {
            return "Nie dziel przez zero!!!!";
        }
    }

    @RequestMapping(value = "/potegowanie/{liczba1}/{liczb2}")
    public double potegowanie(@PathVariable("liczba1") double liczba1, @PathVariable("liczba2") double liczba2){
        double wynik = Math.pow(liczba1, liczba2);
        return wynik;
    }

    @RequestMapping(value = "/pierwiastkowanieDrugiegoStopnia/{liczba1}")
    public String pierwiastkowanie(@PathVariable("liczba1") int liczba1){
        double wynik = Math.sqrt(liczba1);
        return "Wynik pierwiastkowania stopnia drugiego to "+wynik;
    }
}
