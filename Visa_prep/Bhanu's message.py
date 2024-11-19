def is_valid(msg):
    
    if len(msg) < 10 or len(msg) > 20:
        return False
    
    if msg[0] == '+':
        msg = msg[1:]
    
    if not all(c.isdigit() or c == ' ' for c in msg):
        return False
    
    num = msg.split()
    if len(num) == 2:
        code, phone = num[0], num[1]
        
        if not (len(code) == 2 and code.isdigit()):
            return False
    
    elif len(num) == 1:
        phone = num[0]
    else:
        return False
    
    if len(phone) != 10 or not phone.isdigit():
        return False
    sum_d = sum(int(digit) for digit in phone)
    return sum_d > 0

if __name__ == "__main__":
    msg = input().strip()
    
    if is_valid(msg):
        print("Correct")
    else:
        print("Incorrect")
