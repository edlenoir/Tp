import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("b124b38d-ac20-4fbe-b7b0-15b552178f31")
public abstract class Reservoir {
    @objid ("c35e90ac-99c8-4014-b722-96c57819110c")
    private int nbCoupures;

    @objid ("6e54bff1-cb08-4171-9a26-7ee2a91c7311")
    public void delivrerBillets(int nbBillets) {
    }

    @objid ("54d9fe94-0497-47bd-b007-09e8b73549d6")
    public int nbBilletsADelivrer(int montant) {
    }

    @objid ("d3bcb9f7-6da7-4024-bdd6-e9a58c875320")
    public abstract int valeurCoupure();

    @objid ("5bcffdd3-90d5-44fd-b834-8ff8d5b79106")
    public int getNbCoupures() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nbCoupures;
    }

    @objid ("3223e0fc-846a-4fa6-bf96-83256a5f5930")
    public void setNbCoupures(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nbCoupures = value;
    }

    @objid ("9151376b-c85e-4865-be0e-a9f8a9f54f0b")
    public Reservoir(int nbCoupures) {
    }

}
