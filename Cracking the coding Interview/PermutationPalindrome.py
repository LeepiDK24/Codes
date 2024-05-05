import itertools

def is_palindrome_permutation(s: str) -> bool:
    s = s.replace(" ", "").lower()
    for permutation in itertools.permutations(s):
        palindrome = "".join(permutation)
        if palindrome == palindrome[::-1]:
            return True

    return False
s=input("Enter a string : ")
print(is_palindrome_permutation(s))