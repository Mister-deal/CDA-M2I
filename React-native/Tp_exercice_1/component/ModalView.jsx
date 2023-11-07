import { useState } from "react"

const { Modal, View, Text, Image, Button, StyleSheet, TextInput, FlatList, ViewBase, Pressable } = require("react-native")



const ModalView = (props) => {
    const [textInput,setTextInput]= useState('')
    const [listing, setListing]= useState([])
    

    const text = (e) => {
        setTextInput(e)
        console.log(textInput)
    }

    const addElementToListing = () =>{
        setListing([...listing, textInput])
        console.log(listing, setListing);
    }

    const deleteElementToListing = (itemId) =>{
        const updatedData = listing.filter(itemData => itemData.id != itemId);
        setListing(updatedData);
        console.log(listing, setListing, updatedData);
    }
    return(
        <Modal visible={props.visible} style={styles.Modal}>
            <View>
                <Text style={styles.monTitre}>Eshop</Text>
                <Image source={require('../img/shop.png')} style={styles.image} />
                <TextInput style={styles.input} onChangeText={text} value={textInput} />
                <Button title="confirm here" onPress={addElementToListing}/>
                <FlatList data={listing} renderItem={(itemData) => {
                    return (
                        <View style={styles.listDiv}>
                            <Pressable onPress={() => deleteElementToListing(itemData.id)}>
                                <Text style={styles.list}>{itemData.item}</Text>
                            </Pressable>
                        </View>
                    )
                }} keyExtractor={(item, index) => {
                    return index
                }}
                />
                <Button title="close Modal" onPress={props.CloseModal} />
            </View>
        </Modal>
    )
}

const styles =  StyleSheet.create({
    Modal: {
        flex: 1,
        alignItems: 'flex-start',
        padding: 10,
    },
    input: {
        flex: 0.2,
        height: 25,
        margin: 10,
        padding: 10,
        borderWidth: 5,
        borderTopWidth: 10,
        borderColor: "red"
    },
    monTitre: {
        fontSize: 40,
        color: "black",
        alignSelf: "center",
    },
    image: {
        alignSelf: "center",
        width: 120,
        height: 120
    },
    listDiv: {
        backgroundColor: "aquamarine",
        margin: 10
    },
    list: {
        color: "black",
        alignSelf: "center",
        fontSize: 20
    }
})

export default ModalView