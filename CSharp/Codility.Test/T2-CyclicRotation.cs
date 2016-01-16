using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using CyclicRotation;

namespace Codility.Test
{
    [TestClass]
    public class CyclicRotationTest
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution s = new Solution();
            int[] A = { 3, 8, 9, 7, 6 };
            int[] expected = { 9, 7, 6, 3, 8 };
            int[] result = s.solution(A, 3);
            CollectionAssert.AreEqual(expected, result);
        }

        [TestMethod]
        public void TestMethod2()
        {
            Solution s = new Solution();
            int[] A = { };
            int[] expected = { };
            int[] result = s.solution(A, 3);
            CollectionAssert.AreEqual(expected, result);
        }

        [TestMethod]
        public void TestMethod3()
        {
            Solution s = new Solution();
            int[] A = { 3 };
            int[] expected = { 3 };
            int[] result = s.solution(A, 3);
            CollectionAssert.AreEqual(expected, result);
        }

        [TestMethod]
        public void TestMethod4()
        {
            Solution s = new Solution();
            int[] A = { 3, 8, 9, 7, 6 };
            int[] expected = { 9, 7, 6, 3, 8 };
            int[] result = s.solution(A, 13);
            CollectionAssert.AreEqual(expected, result);
        }
    }
}
