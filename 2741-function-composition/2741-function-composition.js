/**
 * @param {Function[]} functions
 * @return {Function}
 */
var compose = function(functions) {
    
    return function(x) {
         let result = x;

    // Iterate through the functions in reverse order
    for (let i = functions.length - 1; i >= 0; i--) {
      // Apply each function to the current result
      result = functions[i](result);
    }

    // Return the final result
    return result;
        
    }
};

/**
 * const fn = compose([x => x + 1, x => 2 * x])
 * fn(4) // 9
 */