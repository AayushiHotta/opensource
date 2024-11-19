def unique_elements(N, arr):
    # Initialize an empty set to keep track of elements we've already seen
    seen = set()
    # Initialize an empty list to store the result
    result = []
    
    # Iterate over the array
    for num in arr:
        # If the number is not in the 'seen' set, add it to the result and 'seen'
        if num not in seen:
            result.append(num)
            seen.add(num)
    
    # Print the result as space-separated values
    print(" ".join(map(str, result)))

# Read input values
N = int(input())  # Size of the array
arr = list(map(int, input().split()))  # The array itself

# Call the function to get the unique elements
unique_elements(N, arr)
