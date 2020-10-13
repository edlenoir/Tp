public class TestObjetGraphique {
public static void main(String[] args) {
// Creation d’un premier immeuble
Immeuble im1 = new Immeuble(1,10,"blanc",23,5);
// Maj d’un attribut mutable
im1.translater(1.0, 22.5);
// Affichage
System.out.print("Premier immeuble : ");
System.out.println(im1);
// Creation d'un second immeuble par copie de la reference
Immeuble im2 = im1;
// Affichage
System.out.print("Premier immeuble : ");
System.out.println(im1);
System.out.print("Second immeuble : ");
System.out.println(im2);
// Maj d’un attribut mutable
im2.translater(99.0,999.0);
// Affichage
System.out.print("Premier immeuble : ");
System.out.println(im1);
System.out.print("Second immeuble : ");
System.out.println(im2);
}
}
