class Solution:
    def uncommonFromSentences(self, s1: str, s2: str) -> List[str]:
        word_s1 = s1.split()
        word_s2 = word_s1 + s2.split()

        count = Counter(word_s2)

        return [word for word in count if count[word] == 1]

