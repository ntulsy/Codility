using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using CountNonDivisible;

namespace Codility.Test
{
    [TestClass]
    public class CountNonDivisibleTest
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution s = new Solution();
            int[] A = new int[] { 1, 1, 1, 1, 1, 1, 1 };
            int[] result = s.solution(A);
            int[] expected = { 0, 0, 0, 0, 0, 0, 0 };
            CollectionAssert.AreEqual(expected, result);
        }

    }
}
