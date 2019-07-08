// <editor-fold defaultstate="collapsed" desc="cabeçalho de código...">
<#if package?? && package != "">
package ${package}; //esse é nome da "pasta" que seu código está, pois assim tudo fica mais organizado
</#if>

import static entradasaida.JanelaPopup.*;
import static entradasaida.Conversoes.*;
import static java.lang.Double.parseDouble;
import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;
import java.util.ArrayList;
import java.util.List;

public class ${name} {

    public static void main(String[] args) {
        println("\n\n\n  [Início] :) -----------------------------------------------------------------------------------------------------------\n\n");
// </editor-fold>        
        //seu código começa aqui =)
        
        Integer idade = lerInteger("Qual é a sua idade?");        
        escreverLinhaDeString("Então você tem " + idade + " anos e eu apenas alguns minutos ;)");
        
        
        
        
        
        //seu código termina aqui :0     
// <editor-fold defaultstate="collapsed" desc="rodapé de código...">
        println("\n\n\n     [Fim] :) -----------------------------------------------------------------------------------------------------------\n\n");
    }//método main
}//classe Executavel
// </editor-fold>