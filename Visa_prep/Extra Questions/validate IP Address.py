class Solution(object):
    def IPV4_check(self, queryIP):
        x = queryIP.split(".")

        # Check length
        if len(x) != 4:
            return False

        # Validate each part
        for num in x:
            if not num.isdigit() or not (0 <= int(num) <= 255) or (len(num) > 1 and num[0] == '0'):
                return False

        return True

    def IPV6_check(self, queryIP):
        parts = queryIP.split(":")
        
        # Check length
        if len(parts) != 8:
            return False
        
        # Validate each part
        for part in parts:
            if not (1 <= len(part) <= 4) or not all(c in "0123456789abcdefABCDEF" for c in part):
                return False

        return True

    def validIPAddress(self, queryIP):
        if "." in queryIP and self.IPV4_check(queryIP):
            return "IPv4"
        elif ":" in queryIP and self.IPV6_check(queryIP):
            return "IPv6"
        else:
            return "Neither"
