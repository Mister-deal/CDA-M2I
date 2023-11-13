import { Button, StyleSheet, Text, View } from 'react-native'


export default function Home({navigation}) {
    return(
        <View style={styles.container}>
            <Text style={styles.title}>PokeNav</Text>
            <Button style={styles.buttonClr} title='PokeListe' onPress={() => navigation.navigate("PokeList")}></Button>
            <Button style={styles.buttonClr} title='PokeDex' onPress={() => navigation.navigate("PokeDex")}></Button>
        </View>
    )
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        padding: 20
    },
    title: {
        justifyContent: "center",
        fontSize: 50,
    },
    buttonClr: {
        color: "blue"
    }
})