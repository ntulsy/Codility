using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Ladder;

namespace Codility.Test
{
    [TestClass]
    public class LadderTest
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution s = new Solution();
            int[] A = { 4, 4, 5, 5, 1 };
            int[] B = { 3, 2, 4, 3, 1 };
            int[] result = s.solution(A, B);
            int[] expected = { 5, 1, 8, 0, 1 };
            CollectionAssert.AreEqual(expected, result);
        }
    }
}
