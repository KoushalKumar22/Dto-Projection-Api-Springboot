package com.example.Projection_Dto.DTO;

public class AttenndanceDto {

    int id;
    String name;

    int std;


    public AttenndanceDto(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /* enable this to show std


    public AttenndanceDto(int id, String name, int std) {
        this.id = id;
        this.name = name;
        this.std = std;
    }


        public int getStd() {
        return std;
    }

    public void setStd(int std) {
        this.std = std;
    }


     */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
