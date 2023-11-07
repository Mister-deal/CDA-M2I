import ModalView from "./ModalView";

const { useState } = require("react");
const { View, Button } = require("react-native")






const AddArticle = () => {

    const [modalVisible, setModalVisible]= useState(false)

    function OpenModal(){
        console.log("bouton Add appuyé");
        setModalVisible(true)
    }

    function CloseModal(){
        console.log("fermeture modal");
        setModalVisible(false);
    }

    

    return(
        <View>
            <Button title="Add Article here" onPress={OpenModal}/>
            <ModalView visible={modalVisible} CloseModal={CloseModal}></ModalView>
            
        </View>
    )
}

export default AddArticle