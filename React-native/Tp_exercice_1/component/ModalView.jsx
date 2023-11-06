import { useState } from "react"

const { Modal, View, Text, Image, Button, StyleSheet, TextInput, FlatList, ViewBase } = require("react-native")



const ModalView = (props) => {
    const [textInput,setTextInput]= useState('')
    const [listing, setListing]= useState([])
    

    const text = (e) => {
        setTextInput(e)
        console.log(textInput)
    }

    const addElementToListing = () =>{
        setListing([...listing, textInput])
    }
    return(
        <Modal visible={props.visible} style={styles.Modal}>
            <View>
                <Text style={styles.monTitre}>Liste Courses:</Text>
                <TextInput onChangeText={text} value={textInput} />
                <Button title="confirm here" onPress={addElementToListing}/>
                <FlatList data={listing} renderItem={(itemData) => {
                    return (
                        <View>
                            <Text>{itemData.item}</Text>
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
    monTitre: {
        fontSize: 30,
        color: "red",
        alignSelf: "center"
    }
})

export default ModalView