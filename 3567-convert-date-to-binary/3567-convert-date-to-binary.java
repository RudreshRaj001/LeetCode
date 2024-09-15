class Solution {
    public String convertDateToBinary(String date) {
        // Split the date into year, month, and day
        String[] dateParts = date.split("-");

        // Convert year, month, and day to integers
        int year = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]);
        int day = Integer.parseInt(dateParts[2]);

        // Convert each part to its binary representation using shifts
        String yearBinary = convertToBinaryShift(year);
        String monthBinary = convertToBinaryShift(month);
        String dayBinary = convertToBinaryShift(day);

        // Concatenate the binary representations with dashes
        return yearBinary + "-" + monthBinary + "-" + dayBinary;
    }

    // Helper method to convert an integer to binary representation using right shift
    private String convertToBinaryShift(int num) {
        StringBuilder binary = new StringBuilder();

        if (num == 0) {
            return "0"; // Edge case: binary of 0 is "0"
        }

        // Determine how many bits are required to represent the number
        for (int i = 31; i >= 0; i--) {
            // Use left shift to check the ith bit from the left (most significant bit)
            int bit = (num >> i) & 1;  // Extract the ith bit
            if (binary.length() > 0 || bit == 1) {
                binary.append(bit);  // Avoid appending leading zeros
            }
        }

        return binary.toString();  // Return the binary string
    }
}
