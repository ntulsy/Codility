using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using OddOccurrencesInArray;

namespace Codility.Test
{
    [TestClass]
    public class OddOccurrencesInArrayTest
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution s = new Solution();
            int[] A = { 9, 3, 9, 3, 9, 7, 9 };
            int result = s.solution(A);
            Assert.AreEqual(7, result);
        }

        [TestMethod]
        public void TestMethod2()
        {
            Solution s = new Solution();
            int[] A = { 0, 0, 0, 0, 0, 0, 0 };
            int result = s.solution(A);
            Assert.AreEqual(0, result);
        }

        [TestMethod]
        public void TestMethod3()
        {
            Solution s = new Solution();
            int[] A = { 1 };
            int result = s.solution(A);
            Assert.AreEqual(1, result);
        }
    }
}
