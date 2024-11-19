s = "192.168.1.9"
x = s.split(".")

# Check if it has exactly 4 parts
length_check = len(x) == 4

# Initialize range_check
range_check = True

# Validate each part
for mrec in x:
    # Ensure each part is a number within the range 0-255
    if not mrec.isdigit() or not (0 <= int(mrec) <= 255):
        range_check = False
        break  # No need to check further if one part fails

# Final result
print(length_check and range_check)
