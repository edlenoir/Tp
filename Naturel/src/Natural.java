import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("e846880f-c48d-4861-b45d-0a879197b6eb")
public class Natural {
    @objid ("8744992e-4756-4223-a713-3577a364028f")
    private Cellule tete;

    @objid ("91339a4e-9b3b-4674-a390-ebcabfe12c04")
    public Natural(int Valeur) {
    }

    @objid ("1686942f-8950-4f91-af0a-41230c93c582")
    private class Cellule {
        @objid ("22f8ff66-d83f-49cf-a0b8-12b4bce3576b")
        private int Valeur;

        @objid ("1cf9aea0-52e6-4b68-b2da-110881161fb6")
        private Cellule suivant;

        @objid ("4c2e926f-0570-4b5c-aff4-340fe4535d58")
        public Cellule() {
        }

    }

}