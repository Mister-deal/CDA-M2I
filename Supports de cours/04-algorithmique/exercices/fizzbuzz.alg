<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="SI (readNb == -1) ALORS" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2lignes="" F2para="" F2etat="inactif" F2defaut=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param totalBoucles="5000000" nbDecimales="8" arrondiAuto="vrai" epaisseurLigne="2" maxBoucle="500000" totalAffichages="1000" epaisseurPoint="2"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions">
        <item algoitem="FONCTION readFizzBuzz(readNb)" code="201#readFizzBuzz#readNb">
            <item algoitem="VARIABLES_FONCTION" code="202#declarationsvariablesfonction"/>
            <item algoitem="DEBUT_FONCTION" code="203#debutfonction"/>
            <item algoitem="SI (readNb == - 3) ALORS" code="6#readNb == - 3">
                <item algoitem="DEBUT_SI" code="7#debutsi"/>
                <item algoitem="AFFICHER &quot;FizzBuzz&quot;" code="4#FizzBuzz#0"/>
                <item algoitem="FIN_SI" code="8#finsi"/>
                <item algoitem="SINON" code="9#sinon">
                    <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                    <item algoitem="SI (readNb == -2) ALORS" code="6#readNb == -2">
                        <item algoitem="DEBUT_SI" code="7#debutsi"/>
                        <item algoitem="AFFICHER &quot;Buzz&quot;" code="4#Buzz#0"/>
                        <item algoitem="FIN_SI" code="8#finsi"/>
                        <item algoitem="SINON" code="9#sinon">
                            <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                            <item algoitem="SI (readNb == -1) ALORS" code="6#readNb == -1">
                                <item algoitem="DEBUT_SI" code="7#debutsi"/>
                                <item algoitem="AFFICHER &quot;Fizz&quot;" code="4#Fizz#0"/>
                                <item algoitem="FIN_SI" code="8#finsi"/>
                                <item algoitem="SINON" code="9#sinon">
                                    <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                                    <item algoitem="AFFICHERCALCUL readNb" code="20#readNb#0"/>
                                    <item algoitem="FIN_SINON" code="11#finsinon"/>
                                </item>
                            </item>
                            <item algoitem="FIN_SINON" code="11#finsinon"/>
                        </item>
                    </item>
                    <item algoitem="FIN_SINON" code="11#finsinon"/>
                </item>
            </item>
            <item algoitem="FIN_FONCTION" code="204#finfonction"/>
        </item>
        <item algoitem="FONCTION setFizzBuzz(nbSet)" code="201#setFizzBuzz#nbSet">
            <item algoitem="VARIABLES_FONCTION" code="202#declarationsvariablesfonction"/>
            <item algoitem="DEBUT_FONCTION" code="203#debutfonction"/>
            <item algoitem="SI (nbSet % 15 == 0 &amp;&amp; nbSet != 0) ALORS" code="6#nbSet % 15 == 0 &amp;&amp; nbSet != 0">
                <item algoitem="DEBUT_SI" code="7#debutsi"/>
                <item algoitem="RENVOYER -3" code="205#-3"/>
                <item algoitem="FIN_SI" code="8#finsi"/>
                <item algoitem="SINON" code="9#sinon">
                    <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                    <item algoitem="SI (nbSet % 5 == 0 &amp;&amp; nbSet != 0) ALORS" code="6#nbSet % 5 == 0 &amp;&amp; nbSet != 0">
                        <item algoitem="DEBUT_SI" code="7#debutsi"/>
                        <item algoitem="RENVOYER -2" code="205#-2"/>
                        <item algoitem="FIN_SI" code="8#finsi"/>
                        <item algoitem="SINON" code="9#sinon">
                            <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                            <item algoitem="SI (nbSet % 3 == 0 &amp;&amp; nbSet != 0) ALORS" code="6#nbSet % 3 == 0 &amp;&amp; nbSet != 0">
                                <item algoitem="DEBUT_SI" code="7#debutsi"/>
                                <item algoitem="RENVOYER -1" code="205#-1"/>
                                <item algoitem="FIN_SI" code="8#finsi"/>
                                <item algoitem="SINON" code="9#sinon">
                                    <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                                    <item algoitem="RENVOYER nbSet" code="205#nbSet"/>
                                    <item algoitem="FIN_SINON" code="11#finsinon"/>
                                </item>
                            </item>
                            <item algoitem="FIN_SINON" code="11#finsinon"/>
                        </item>
                    </item>
                    <item algoitem="FIN_SINON" code="11#finsinon"/>
                </item>
            </item>
            <item algoitem="FIN_FONCTION" code="204#finfonction"/>
        </item>
    </item>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="i EST_DU_TYPE NOMBRE" code="1#NOMBRE#i"/>
        <item algoitem="nbUser EST_DU_TYPE NOMBRE" code="1#NOMBRE#nbUser"/>
        <item algoitem="myFizzBuzz EST_DU_TYPE LISTE" code="1#LISTE#myFizzBuzz"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;Veuillez entrer un nombre entier strictement supérieur à 0 : &quot;" code="4#Veuillez entrer un nombre entier strictement supérieur à 0 : #0"/>
        <item algoitem="LIRE nbUser" code="2#nbUser#pasliste"/>
        <item algoitem="POUR i ALLANT_DE 1 A nbUser" code="12#i#1#nbUser">
            <item algoitem="DEBUT_POUR" code="13#debutpour"/>
            <item algoitem="myFizzBuzz[i - 1] PREND_LA_VALEUR setFizzBuzz(i)" code="5#myFizzBuzz#setFizzBuzz(i)#i - 1"/>
            <item algoitem="FIN_POUR" code="14#finpour"/>
        </item>
        <item algoitem="AFFICHER &quot;\nMon FizzBuzz : [&quot;" code="4#\nMon FizzBuzz : [#0"/>
        <item algoitem="POUR i ALLANT_DE 0 A nbUser - 2" code="12#i#0#nbUser - 2">
            <item algoitem="DEBUT_POUR" code="13#debutpour"/>
            <item algoitem="APPELER_FONCTION readFizzBuzz(myFizzBuzz[i])" code="206#readFizzBuzz(myFizzBuzz[i])"/>
            <item algoitem="AFFICHER &quot;, &quot;" code="4#, #0"/>
            <item algoitem="FIN_POUR" code="14#finpour"/>
        </item>
        <item algoitem="APPELER_FONCTION readFizzBuzz(myFizzBuzz[nbUser-1])" code="206#readFizzBuzz(myFizzBuzz[nbUser-1])"/>
        <item algoitem="AFFICHER &quot;]&quot;" code="4#]#1"/>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
