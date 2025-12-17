class Solution:
    def mostWordsFound(self, sentences: List[str]) -> int:
        ans = 0
        for i in range(len(sentences)):
            li = sentences[i]
            temp = 1
            for j in range(len(li)):
                ch= li[j]
                if ch == " ":
                    temp = temp + 1
            ans = max(ans, temp)
        return ans



        