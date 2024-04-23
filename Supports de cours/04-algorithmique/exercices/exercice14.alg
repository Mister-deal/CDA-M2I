<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="FIN_POUR" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2etat="inactif" F2defaut="" F2lignes="" F2para=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param epaisseurLigne="2" epaisseurPoint="2" nbDecimales="8" arrondiAuto="vrai" totalBoucles="5000000" totalAffichages="1000" maxBoucle="500000"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#i" algoitem="i EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#j" algoitem="j EST_DU_TYPE NOMBRE"/>
        <item code="1#CHAINE#affichage" algoitem="affichage EST_DU_TYPE CHAINE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="12#i#1#10" algoitem="POUR i ALLANT_DE 1 A 10">
            <item code="13#debutpour" algoitem="DEBUT_POUR"/>
            <item code="6#i / 10 >= 1" algoitem="SI (i / 10 >= 1) ALORS">
                <item code="7#debutsi" algoitem="DEBUT_SI"/>
                <item code="5#affichage#affichage + &quot;   &quot; + i#pasliste" algoitem="affichage PREND_LA_VALEUR affichage + &quot;   &quot; + i"/>
                <item code="8#finsi" algoitem="FIN_SI"/>
                <item code="9#sinon" algoitem="SINON">
                    <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                    <item code="5#affichage#affichage + &quot;    &quot; + i#pasliste" algoitem="affichage PREND_LA_VALEUR affichage + &quot;    &quot; + i"/>
                    <item code="11#finsinon" algoitem="FIN_SINON"/>
                </item>
            </item>
            <item code="14#finpour" algoitem="FIN_POUR"/>
        </item>
        <item code="3#affichage#1#pasliste" algoitem="AFFICHER affichage"/>
        <item code="5#affichage#&quot;&quot;#pasliste" algoitem="affichage PREND_LA_VALEUR &quot;&quot;"/>
        <item code="12#i#1#10" algoitem="POUR i ALLANT_DE 1 A 10">
            <item code="13#debutpour" algoitem="DEBUT_POUR"/>
            <item code="5#affichage#affichage + &quot;_____&quot;#pasliste" algoitem="affichage PREND_LA_VALEUR affichage + &quot;_____&quot;"/>
            <item code="14#finpour" algoitem="FIN_POUR"/>
        </item>
        <item code="3#affichage#1#pasliste" algoitem="AFFICHER affichage"/>
        <item code="5#affichage#&quot;&quot;#pasliste" algoitem="affichage PREND_LA_VALEUR &quot;&quot;"/>
        <item code="12#i#1#10" algoitem="POUR i ALLANT_DE 1 A 10">
            <item code="13#debutpour" algoitem="DEBUT_POUR"/>
            <item code="5#affichage#&quot;&quot;#pasliste" algoitem="affichage PREND_LA_VALEUR &quot;&quot;"/>
            <item code="12#j#1#10" algoitem="POUR j ALLANT_DE 1 A 10">
                <item code="13#debutpour" algoitem="DEBUT_POUR"/>
                <item code="6#i * j / 100 >= 1" algoitem="SI (i * j / 100 >= 1) ALORS">
                    <item code="7#debutsi" algoitem="DEBUT_SI"/>
                    <item code="5#affichage#affichage + &quot;  &quot; + i * j#pasliste" algoitem="affichage PREND_LA_VALEUR affichage + &quot;  &quot; + i * j"/>
                    <item code="8#finsi" algoitem="FIN_SI"/>
                    <item code="9#sinon" algoitem="SINON">
                        <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                        <item code="6#i * j / 10 >= 1" algoitem="SI (i * j / 10 >= 1) ALORS">
                            <item code="7#debutsi" algoitem="DEBUT_SI"/>
                            <item code="5#affichage#affichage + &quot;   &quot; + i * j#pasliste" algoitem="affichage PREND_LA_VALEUR affichage + &quot;   &quot; + i * j"/>
                            <item code="8#finsi" algoitem="FIN_SI"/>
                            <item code="9#sinon" algoitem="SINON">
                                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                                <item code="5#affichage#affichage + &quot;    &quot; + i * j#pasliste" algoitem="affichage PREND_LA_VALEUR affichage + &quot;    &quot; + i * j"/>
                                <item code="11#finsinon" algoitem="FIN_SINON"/>
                            </item>
                        </item>
                        <item code="11#finsinon" algoitem="FIN_SINON"/>
                    </item>
                </item>
                <item code="14#finpour" algoitem="FIN_POUR"/>
            </item>
            <item code="3#affichage#1#pasliste" algoitem="AFFICHER affichage"/>
            <item code="14#finpour" algoitem="FIN_POUR"/>
        </item>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
