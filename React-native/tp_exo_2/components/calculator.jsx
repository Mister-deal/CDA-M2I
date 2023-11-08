import React, { useState } from 'react';
import { StyleSheet, Text, View, TouchableOpacity } from 'react-native';

const Calculator = () => {
  const [input, setInput] = useState('');

  const handlePress = (value) => {
    setInput(input + value);
  };

  const handleDelete = () => {
    setInput(input.slice(0, -1));
  };

  const calculateExpression = (expression) => {
    const operators = ['+', '-', '*', '/', "%"];
    const sanitizedExpression = expression.replace(/[^0-9+\-*/.%]/g, '');
  
    // Check if the expression contains only valid characters
    if (/[^0-9+\-*/.%]$/.test(expression)) {
      return 'Error';
    }
  
    try {
      // Check if the expression ends with an operator or a decimal point
      if (operators.includes(sanitizedExpression.slice(-1))) {
        return 'Error';
      }
  
      const result = new Function(`return ${sanitizedExpression}`)();
      return result.toString();
      
    } catch (error) {
      return 'Error';
    }
  };
  
  const handleCalculate = () => {
    const result = calculateExpression(input);
    setInput(result);
  };

  const handleAddition = () => {
    setInput(input + '+');
  };

  const handleDot = () => {
    setInput(input + '.');
  };

  const handleMultiplication = () => {
    setInput(input + '*');
  };

  const handleSubstraction = () => {
    setInput(input + '-')
  }

  const handleDivision = () => {
    setInput(input + '/')
  }

  const handlePercentage = () => {
    setInput(input + '%')
  }

  const handleClear = () => {
    setInput('');
  };

  return (
    <View style={styles.container}>
      <Text style={styles.display}>{input}</Text>
      <View style={styles.buttonContainer}>
        <TouchableOpacity style={styles.buttonCalc} onPress={handleClear}>
          <Text style={styles.textCalc}>AC</Text>
        </TouchableOpacity>
        <TouchableOpacity style={styles.buttonCalc} onPress={handleClear}>
          <Text style={styles.textCalc}>^</Text>
        </TouchableOpacity>
        <TouchableOpacity style={styles.buttonCalc} onPress={handlePercentage}>
          <Text style={styles.textCalc}>%</Text>
        </TouchableOpacity>
        <TouchableOpacity style={styles.buttonCalc} onPress={handleDivision}>
          <Text style={styles.textCalc}>/</Text>
        </TouchableOpacity>
        <TouchableOpacity style={styles.button} onPress={() => handlePress('7')}>
          <Text style={styles.text}>7</Text>
        </TouchableOpacity>
        <TouchableOpacity style={styles.button} onPress={() => handlePress('8')}>
          <Text style={styles.text}>8</Text>
        </TouchableOpacity>
        <TouchableOpacity style={styles.button} onPress={() => handlePress('9')}>
          <Text style={styles.text}>9</Text>
        </TouchableOpacity>
        <TouchableOpacity style={styles.buttonCalc} onPress={handleMultiplication}>
          <Text style={styles.textCalc}>*</Text>
        </TouchableOpacity>
        <TouchableOpacity style={styles.button} onPress={() => handlePress('4')}>
          <Text style={styles.text}>4</Text>
        </TouchableOpacity>
        <TouchableOpacity style={styles.button} onPress={() => handlePress('5')}>
          <Text style={styles.text}>5</Text>
        </TouchableOpacity>
        <TouchableOpacity style={styles.button} onPress={() => handlePress('6')}>
          <Text style={styles.text}>6</Text>
        </TouchableOpacity>
        <TouchableOpacity style={styles.buttonCalc} onPress={handleSubstraction}>
          <Text style={styles.textCalc}>-</Text>
        </TouchableOpacity>
        <TouchableOpacity style={styles.button} onPress={() => handlePress('1')}>
          <Text style={styles.text}>1</Text>
        </TouchableOpacity>
        <TouchableOpacity style={styles.button} onPress={() => handlePress('2')}>
          <Text style={styles.text}>2</Text>
        </TouchableOpacity>
        <TouchableOpacity style={styles.button} onPress={() => handlePress('3')}>
          <Text style={styles.text}>3</Text>
        </TouchableOpacity>
        <TouchableOpacity style={styles.buttonCalc} onPress={handleAddition}>
          <Text style={styles.textCalc}>+</Text>
        </TouchableOpacity>
        <TouchableOpacity style={styles.button} onPress={handleDot}>
          <Text style={styles.text}>.</Text>
        </TouchableOpacity>
        <TouchableOpacity style={styles.button} onPress={() => handlePress('0')}>
          <Text style={styles.text}>0</Text>
        </TouchableOpacity>
        <TouchableOpacity style={styles.button} onPress={handleDelete}>
          <Text style={styles.text}>del</Text>
        </TouchableOpacity>
        <TouchableOpacity style={styles.buttonCalc} onPress={handleCalculate}>
          <Text style={styles.textCalc}>=</Text>
        </TouchableOpacity>
      </View>
    </View>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'flex-end',
    alignItems: 'center',
    padding: 20,
    backgroundColor: "black"
  },
  display: {
    fontSize: 70,
    marginBottom: 20,
    color: "white",
  },
  buttonContainer: {
    flexDirection: 'row',
    flexWrap: 'wrap',
  },
  button: {
    width: 70,
    height: 80,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: 'white',
    margin: 10,
    borderTopLeftRadius: 60,
    borderTopRightRadius: 60,
    borderBottomLeftRadius: 60,
    borderBottomRightRadius: 60,
  },
  buttonCalc: {
    width: 70,
    height: 80,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: "grey",
    margin: 10,
    borderTopLeftRadius: 20,
    borderTopRightRadius: 20,
    borderBottomLeftRadius: 20,
    borderBottomRightRadius: 20,
  },
  text: {
    fontSize: 35,
    fontWeight: "bold",
    color: "black"
  },
  textCalc: {
    fontSize: 35,
    fontWeight: "bold",
    color: "white"
  }
});

export default Calculator;