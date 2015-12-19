using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using CommonPrimeDivisors;

namespace Codility.Test
{
    [TestClass]
    public class CommonPrimeDivisorsTest
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution s = new Solution();
            int[] A = { 15, 10, 3, 15 };
            int[] B = { 75, 30, 5, 73 };
            int result = s.solution(A, B);
            Assert.AreEqual(1, result);
        }

        [TestMethod]
        public void TestMethod2()
        {
            Solution s = new Solution();
            int[] A = { 1, 2 };
            int[] B = { 1, 2 };
            int result = s.solution(A, B);
            Assert.AreEqual(2, result);
        }
    }
}
