
package sv.edu.cad.controller;


public class Validacion
{
    public boolean ValidacionPassword(char passArray[])
     {
        for(int i = 0; i < passArray.length; i++)
        {
         char c = passArray[i];
         // si no es letra o numero entonces no es valido
         if(!Character.isLetterOrDigit(c))
         {
          return false;
         }
        }
        return true;
     }
}
