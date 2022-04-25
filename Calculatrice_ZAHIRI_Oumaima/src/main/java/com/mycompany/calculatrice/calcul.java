/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculatrice;




/**
 *
 * @author oumaima
 */
public class calcul {
    private String term1, term2, operand, result;
    
    // la méthode eval permet d'évaluer le String entree en parametre
    public String eval(String str) throws ArithmeticException {
    	// parcours est un String d'un seul caractère qui, comme son nom l'indique, va parcourir notre string str
    	// définir un String parcours permet de simplifier les multiples tests qu'on fera lors du parcours de str
        String parcours=str.substring(0,1);
        // on initialise les deux termes de l'operation (pour ne pas qu'ils soient egaux à null).
        term1="";
        term2="";
        String nb = "0123456789,";
        String operands = "*+-x/%^";
        // on  définit un compteur qui permettra de découper le str
        int i=1;
        
        // On vérifie si le premier paramètre de str est l'opérateur - pour compter le premier terme comme étant 
        // simplement un nombre négatif au lieu de juger erronée l'expression str
        if (parcours=="-") {
            term1="-";
            parcours=str.substring(i,i+1);
            i=2;
        }
        
        // Tant que parcours est un chiffre ou une virgule, on le rajoute au premier terme : il s'agit toujours du même nombre
        while (nb.contains(parcours)) {
            if (parcours.equals(",")) {
            	// La virgule a un aspect visuel plus esthétique, mais n'est pas évaluée par le compilateur, on la remplace alors
            	// par un point (en revanche, si le résultat contient un point, on le remplacera par une virgule pour l'affichage)
            	// cf la ligne 142
                term1=term1+".";  
            }
            else {
                term1=term1+parcours;
            }
            parcours=str.substring(i,i+1);
            i=i+1;
        }
        
        if (operands.contains(parcours)) { // on vérifier si parcours est un opérateur, on définit donc l'opérateur de l'expression
        	operand=parcours;
        }
        else if (!((operands.contains(parcours))||(nb.contains(parcours)))) { // si le caractère n'est ni un chiffre, ni un opérateur, ni une virgule, il s'agit d'un caractère erroné
        	popup p = new popup("(This character is not recognised !)");
            p.show();
            return "Error";
        } // on a rajouté de texte parce que le text field qu'on a choisi donne à l'utilisateur le choix entre utiliser
        // les boutons de l'application ou entrer à la main l'expression
        
        parcours=str.substring(i,i+1);
        
        while (nb.contains(parcours)) { // boucle pour définir le deuxièle terme de l'expression basé sur le même principe
                    i=i+1;
                    if (parcours.equals(",")) {
                        term2=term2+".";  
                    }
                    else {
                        term2=term2+parcours;                        
                    }
                    if(str.length()==i) { // on continue à parcourir le str jusqu'à ce qu'on le finisse (au cas où il y a une seule opération dans l'expression)
                        parcours="x";
                    }
                    else {parcours=str.substring(i,i+1);}                    
        }
        
        
        System.out.println("term2 : " + term2);
        
        // on continue le parcours jusqu'à ce qu'il n y ait plus de caractères (l'utilisateur peut donc effectuer le nombre d'opérations qu'il souhaite
        // sans avoir besoin de taper entrée ou cliquer sur le bouton enter.
        
        while (str.length()!=i) { 
        		// Dès qu'on a plus que deux termes, on calcule le réultats de la première opération, le stocke dans le premier terme et mettre le 3ème terme dans le 2ème
        		// ceci permet d'avoir toujours deux termes pour n'importe quel nombre d'opérations afin de simplifier les calculs.
                calculate();
                term1=result;
                term2="";
                if (operands.contains(parcours)) {
                	operand=parcours;
                }
                else {
                	popup p = new popup("(This character is not recognised !)");
                    p.show();
                    return "Error";
                }
                
                i=i+1;
                parcours=str.substring(i,i+1);
                while (nb.contains(parcours)) {
                    i=i+1;
                    if (parcours.equals(",")) {
                        term2=term2+".";  
                    }
                    else {
                        term2=term2+parcours;
                        if(str.length()==i) {
                            parcours="x";
                            break;
                        }
                        else {parcours=str.substring(i,i+1);}
                    }    
                }
                if ((!(operands.contains(parcours)))&&(!parcours.equals("x"))) {
                	popup p = new popup("(This character is not recognised !)");
                    p.show();
                    return "Error";
                }
                System.out.println("term3 : " + term2);
        }
        
        // maintenant qu'on a défini les deux termes de l'opération, on passe par une fonction qui calcule directement le résultat (calculate)
        this.calculate();
        
        // Comme le langage retourne toujours les doubles avec une virgule (.0), on supprime ce terme pour un affichage plus esthétique
        // on a fait le test parce que le programme ne retourne pas que des réels, il retourne des erreurs aussi dans quelques cas
        // pour traiter le cas des erreurs séparément, on a donc choisi de ne pas faire la soustraction dans tous les cas (on aurait
        // pu et prendre ceci en contact pendant l'étude des erreurs).
        
        if(result.substring(result.length()-2, result.length()).equals(".0")) {
        	result=result.substring(0, result.length()-2);
        }
              
        System.out.println(result);        
            
        return result.replace('.',',');
    }
    
    
    /** La fonction calculate distingue d'abord l'opérateur de l'expression, il convertit ensuite chacun des deux termes 
     * en double et calcule le résultat entre les deux par l'opération définie par l'opérateur et le stocke dans result.
     */

    public void calculate() {
        switch(this.operand){
            case "+":
                this.result=Double.toString(Double.parseDouble(term1)+Double.parseDouble(term2));
                break;
                
            case "-":
                this.result=Double.toString(Double.parseDouble(term1)-Double.parseDouble(term2));
                break;
                
            case "x":
            case "*":
                this.result=Double.toString(Double.valueOf(term1)*Double.valueOf(term2));
                break;
                
            case "/":
                result=Double.toString(Double.valueOf(term1)/Double.valueOf(term2));
                break;
                
            case "%":
                this.result=Double.toString(Double.valueOf(term1)%Double.valueOf(term2));                
                break;
                
            case "^":
                this.result=Double.toString(power(Double.valueOf(term1),Double.valueOf(term2)));            
                break;
        }
    }
    
    public double power(double t1, double t2) { // la fonction power calcule la puissance t2 de t1.
    	if (t2==0) {
    		return 1;
    	}
    	if (t1==0) {
    		popup p = new popup("(You cannot calculate powers of 0 !)");
            p.show();
            return 0;
    	}
    	return power(t1, t2-1)*t1;
    }
}
