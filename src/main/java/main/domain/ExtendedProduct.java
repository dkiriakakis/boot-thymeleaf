package main.domain;

/**
 * Created by ctirs on 17.06.16.
 */
public class ExtendedProduct extends Product {

    private Specifications specifications;
    private Pictures pictures;

    public Specifications getSpecifications() {
        return specifications;
    }

    public void setSpecifications(Specifications specifications) {
        this.specifications = specifications;
    }

    public Pictures getPictures() {
        return pictures;
    }

    public void setPictures(Pictures pictures) {
        this.pictures = pictures;
    }
}
