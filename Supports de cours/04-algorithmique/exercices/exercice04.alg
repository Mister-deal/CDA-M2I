<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="SI (nbPhotocopies &lt; 10) ALORS" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2lignes="" F2etat="inactif" F2para="" F2defaut=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param totalAffichages="1000" totalBoucles="5000000" epaisseurPoint="2" epaisseurLigne="2" nbDecimales="8" maxBoucle="500000" arrondiAuto="vrai"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#nbPhotocopies" algoitem="nbPhotocopies EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#Combien de photocopies voulez-vous ? #0" algoitem="AFFICHER &quot;Combien de photocopies voulez-vous ? &quot;"/>
        <item code="2#nbPhotocopies#pasliste" algoitem="LIRE nbPhotocopies"/>
        <item code="4#Pour #0" algoitem="AFFICHER &quot;Pour &quot;"/>
        <item code="3#nbPhotocopies#0#pasliste" algoitem="AFFICHER nbPhotocopies"/>
        <item code="4# photocopie(s), vous devrez payer #0" algoitem="AFFICHER &quot; photocopie(s), vous devrez payer &quot;"/>
        <item code="6#nbPhotocopies &lt; 10" algoitem="SI (nbPhotocopies &lt; 10) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="20#nbPhotocopies * 0.5#0" algoitem="AFFICHERCALCUL nbPhotocopies * 0.5"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
            <item code="9#sinon" algoitem="SINON">
                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                <item code="6#nbPhotocopies &lt; 20" algoitem="SI (nbPhotocopies &lt; 20) ALORS">
                    <item code="7#debutsi" algoitem="DEBUT_SI"/>
                    <item code="20#nbPhotocopies * 0.4#0" algoitem="AFFICHERCALCUL nbPhotocopies * 0.4"/>
                    <item code="8#finsi" algoitem="FIN_SI"/>
                    <item code="9#sinon" algoitem="SINON">
                        <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                        <item code="20#nbPhotocopies * 0.3#0" algoitem="AFFICHERCALCUL nbPhotocopies * 0.3"/>
                        <item code="11#finsinon" algoitem="FIN_SINON"/>
                    </item>
                </item>
                <item code="11#finsinon" algoitem="FIN_SINON"/>
            </item>
        </item>
        <item code="4# euros.#1" algoitem="AFFICHER &quot; euros.&quot;"/>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
