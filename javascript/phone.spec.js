import { countNodes } from './phone'

describe('phone number', () => {
  test('one simple number', () => {
    const numbers = ['0467123456']
    expect(countNodes(numbers)).toEqual(10)
  })

  test('without common base', () => {
    const numbers = ['0123456789', '1123456789']
    expect(countNodes(numbers)).toEqual(20)
  })

  test('inclusion', () => {
    const numbers = ['0123456789', '0123']
    expect(countNodes(numbers)).toEqual(10)
  })

  test('with common base', () => {
    const numbers = ['0412578440', '0412199803', '0468892011', '112', '15']
    expect(countNodes(numbers)).toEqual(28)
  })

  test('a big list', () => {
    const numbers = [
      '10000',
      '2980950684',
      '5047459100',
      '3811658223',
      '6951565505',
      '0200306553',
      '4924502386',
      '59278',
      '633',
      '776524',
      '9967765390',
      '8044781997',
      '1892478193',
      '28214',
      '3855270610',
      '1130326923',
      '9809183034',
      '820100',
      '8885'
    ]

    expect(countNodes(numbers)).toEqual(144)
  })
})
