import { StyleSheet, Text, View, Button } from 'react-native'
import React from 'react'
import { useNavigation } from '@react-navigation/native'

export default function PageB() {

  const navigation = useNavigation()
  return (
    <View>
      <Text>PageB</Text>
      <Button
      title='Open Drawer'
      onPress={() => navigation.openDrawer()}
      />
      <Button
      title='Goto PageC'
      onPress={() => navigation.navigate("PageC")}
      />
    </View>
  )
}

const styles = StyleSheet.create({})