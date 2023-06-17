export const countNodes = (phoneNumbers) => {
  let count = 0
  const phoneNumbersDict = {}
  phoneNumbers
    .filter((phoneNumber) => phoneNumber.length > 0)
    .forEach((phoneNumber) => {
      const firstDigit = phoneNumber[0]
      const tailNumber = phoneNumber.slice(1)
      if (Object.hasOwn(phoneNumbersDict, firstDigit)) {
        phoneNumbersDict[firstDigit].push(tailNumber)
      } else {
        phoneNumbersDict[firstDigit] = [tailNumber]
        count++
      }
    })

  for (const key in phoneNumbersDict) {
    if (phoneNumbersDict[key].length > 0 && phoneNumbersDict[key] !== '') {
      count += countNodes(phoneNumbersDict[key])
    }
  }
  return count
}
