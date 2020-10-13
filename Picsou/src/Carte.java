import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("928c5d9a-503d-42d0-ad9b-9f630f9e6cd4")
public class Carte {
    @objid ("716b848f-d53d-4945-9be6-a57010e5ccd4")
    private final int code;

    @objid ("a9fff3b8-4c36-4ab2-b0be-bd135818b63c")
    private Compte compte;

    @objid ("8e5d11c4-e6f3-4fe3-8b43-97cbc98f9233")
    public Carte(int code, Compte compte) {
    	this.code=code;
    	this.compte=compte;
    }

    @objid ("97d277e9-954a-487d-b15a-e7478286aeaa")
    public boolean codeCorrect(int code) {
        return this.code==code;
    }

    @objid ("d79c26b4-67b3-4501-8097-b42c32c7ce4e")
    public int getCode() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.code;
    }

    @objid ("67db919e-4f98-4487-ba09-3755b4c1233a")
    public Compte getCompte() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.compte;
    }

    @objid ("54559047-c91e-4279-bf33-97e1552a7091")
    public void setCompte(Compte value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.compte = value;
    }

}
