package org.example.models;

import jakarta.persistence.*;


import java.time.LocalDate;


@Entity
@Table(name = "SalesProduct")
public class SalesProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "DateOfPurchase", nullable = false)
    private LocalDate DateOfPurchase;

    @Column(name = "Return", nullable = false)
    private int Return;

    @Column(name = "Received", nullable = false)
    private int Received;

    // Конструктори, гетери та сетери
    public SalesProduct() {
    }

    public SalesProduct(int Received, int Return, LocalDate DateOfPurchase) {
        this.Received = Received;
        this.Return = Return;
        this.DateOfPurchase = DateOfPurchase;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getReceived() {
        return Received;
    }

    public void setReceived(int Received) {
        this.Received = Received;
    }

    public int getReturn() {
        return Return;
    }

    public int setReturn(int Return) {
        this.Return = Return;
        return this.Return;
    }

    public LocalDate getDateOfPurchase() {
        return DateOfPurchase;
    }

    public void setDateOfPurchase(LocalDate DateOfPurchase) {
        this.DateOfPurchase = DateOfPurchase;
    }


}

