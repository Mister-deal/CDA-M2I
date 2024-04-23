<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="FIN_SI"/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2etat="inactif" F2para="" F2lignes="" F2defaut=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param arrondiAuto="vrai" maxBoucle="500000" totalAffichages="1000" nbDecimales="8" totalBoucles="5000000" epaisseurLigne="2" epaisseurPoint="2"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#poids" algoitem="poids EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#taille" algoitem="taille EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#Quel est votre taille (en cm) : #0" algoitem="AFFICHER &quot;Quel est votre taille (en cm) : &quot;"/>
        <item code="2#taille#pasliste" algoitem="LIRE taille"/>
        <item code="4#Quel est votre poids (en kg) ? #0" algoitem="AFFICHER &quot;Quel est votre poids (en kg) ? &quot;"/>
        <item code="2#poids#pasliste" algoitem="LIRE poids"/>
        <item code="4#Dans notre magasin, nous avons : #0" algoitem="AFFICHER &quot;Dans notre magasin, nous avons : &quot;"/>
        <item code="6#(poids >= 48 &amp;&amp; poids &lt; 54 &amp;&amp; taille >= 169 &amp;&amp; taille &lt; 183) || (poids >= 54 &amp;&amp; poids &lt; 60 &amp;&amp; taille >= 166 &amp;&amp; taille &lt; 178) || (poids >= 60 &amp;&amp; poids &lt; 66 &amp;&amp; taille >= 163 &amp;&amp; taille &lt; 175) || (poids >= 66 &amp;&amp; poids &lt; 72 &amp;&amp; taille >= 160 &amp;&amp; taille &lt; 172)" algoitem="SI ((poids >= 48 &amp;&amp; poids &lt; 54 &amp;&amp; taille >= 169 &amp;&amp; taille &lt; 183) || (poids >= 54 &amp;&amp; poids &lt; 60 &amp;&amp; taille >= 166 &amp;&amp; taille &lt; 178) || (poids >= 60 &amp;&amp; poids &lt; 66 &amp;&amp; taille >= 163 &amp;&amp; taille &lt; 175) || (poids >= 66 &amp;&amp; poids &lt; 72 &amp;&amp; taille >= 160 &amp;&amp; taille &lt; 172)) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="4#Taille 2#0" algoitem="AFFICHER &quot;Taille 2&quot;"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
            <item code="9#sinon" algoitem="SINON">
                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                <item code="6#poids >= 43 &amp;&amp; poids &lt; 66 &amp;&amp; taille >= 145 &amp;&amp; taille &lt; 172" algoitem="SI (poids >= 43 &amp;&amp; poids &lt; 66 &amp;&amp; taille >= 145 &amp;&amp; taille &lt; 172) ALORS">
                    <item code="7#debutsi" algoitem="DEBUT_SI"/>
                    <item code="4#Taille 1#0" algoitem="AFFICHER &quot;Taille 1&quot;"/>
                    <item code="8#finsi" algoitem="FIN_SI"/>
                    <item code="9#sinon" algoitem="SINON">
                        <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                        <item code="6#poids >= 54 &amp;&amp; poids &lt; 78 &amp;&amp; taille >= 163 &amp;&amp; taille &lt; 187" algoitem="SI (poids >= 54 &amp;&amp; poids &lt; 78 &amp;&amp; taille >= 163 &amp;&amp; taille &lt; 187) ALORS">
                            <item code="7#debutsi" algoitem="DEBUT_SI"/>
                            <item code="4#Taille 3#0" algoitem="AFFICHER &quot;Taille 3&quot;"/>
                            <item code="8#finsi" algoitem="FIN_SI"/>
                            <item code="9#sinon" algoitem="SINON">
                                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                                <item code="4#Aucune#0" algoitem="AFFICHER &quot;Aucune&quot;"/>
                                <item code="11#finsinon" algoitem="FIN_SINON"/>
                            </item>
                        </item>
                        <item code="11#finsinon" algoitem="FIN_SINON"/>
                    </item>
                </item>
                <item code="11#finsinon" algoitem="FIN_SINON"/>
            </item>
        </item>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
