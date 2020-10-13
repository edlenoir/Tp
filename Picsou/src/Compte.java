import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("c5bb9838-a086-4cd3-91ee-ce1257a87d97")
public class Compte {
    @objid ("da0c4a11-df72-4781-a10f-a4b4aa78542c")
    private float debit;

    @objid ("249b6d98-3566-4ff0-8ca4-d8726ceb8cfe")
    private float credit;

    @objid ("11fe42df-150f-47a6-a1fd-f5b9d8cf58ae")
    public Compte() {
    	this.credit=0.0F;
    	this.debit=0.0F;
    }

    @objid ("3c2c45f0-7cfc-45c6-bdef-f4c8a5f3e740")
    public float solde() {
    }

    @objid ("f40817ac-5cc0-4260-9e41-2d8e7a26bfc9")
    public Compte deposer(float montant) {
    }

    @objid ("5929f540-3902-4e53-9152-962dac7366b2")
    public Compte retirer(float montant) {
    }

    @objid ("fb7300ea-7848-4bb2-bc6c-533c31c6b327")
    public float getDebit() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.debit;
    }

    @objid ("707d421a-b14c-4217-8318-fce0372a4fda")
    public void setDebit(float value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.debit = value;
    }

    @objid ("423487c9-fa5c-445b-b606-556dfbf576a2")
    public float getCredit() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.credit;
    }

    @objid ("4e4567d6-bc57-43e9-baf4-96c714946746")
    public void setCredit(float value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.credit = value;
    }

}
