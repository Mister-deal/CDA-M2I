import { Button, Image, StyleSheet, Text, View } from 'react-native'


export default function Home({navigation}) {
    const localImage = require('../img/PokeNav.png')
    return(
        <View style={styles.container}>
            <View style={styles.containerSide}>
            <Image style={styles.img} source={localImage}></Image>
            <Text style={styles.title}>Bienvenue sur PokeNav - Ton Guide Ultime pour le Monde Pokémon !</Text>
            </View>
            <Button style={styles.buttonClr} title='PokeListe' onPress={() => navigation.navigate("PokeList")}></Button>
            <Button style={styles.buttonClr} title='PokeDex' onPress={() => navigation.navigate("PokeDex")}></Button>
            <Button style={styles.buttonClr} title='Nous Connaitre' onPress={() => navigation.navigate("NousConnaitre")}></Button>
        </View>
    )
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        padding: 20,
    },
    containerSide: {
        flex: 1,
        padding: 20,
        justifyContent: "center",
        alignItems: "center"
    },
    title: {
        justifyContent: "center",
        fontSize: 20,
    },
    title1 :{
        justifyContent: "center",
        fontSize: 20
    },
    buttonClr: {
        color: "blue",
    },
    img: {
        width: 300,
        height: 300,
        resizeMode: "contain"
    }
})