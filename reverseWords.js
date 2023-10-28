function reverseWords(sentence) {
  // Split the sentence into words
  var words = sentence.split(" ");
  
  // Reverse each word and store them in an array
  var reversedWords = words.map(function(word) {
    return word.split("").reverse().join("");
  });

  // Join the reversed words to form the final sentence
  var reversedSentence = reversedWords.join(" ");

  return reversedSentence;
}

var originalSentence = "Hello, world!";
var reversedSentence = reverseWords(originalSentence);
console.log(reversedSentence);
